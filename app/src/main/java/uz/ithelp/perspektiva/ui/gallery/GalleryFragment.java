package uz.ithelp.perspektiva.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


import uz.ithelp.perspektiva.MainActivity4;
import uz.ithelp.perspektiva.R;
import uz.ithelp.perspektiva.databinding.FragmentGalleryBinding;


public class GalleryFragment extends Fragment implements UserAdapter.SelectedUser{

    private FragmentGalleryBinding binding;
    RecyclerView recyclerView2;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView2 = root.findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers, this);
        recyclerView2.setAdapter(userAdapter);



        return root;
    }

    private void initial() {

        modelRcyclers.add(new ModelRcycler(R.drawable.video,"1-video. Perspektiv tasvir qurish usullari","Perspektiv tasvir qurish usullari borasida to'liq...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"2-video. Eng yaxshi ko'rish burchagi","Eng yaxshi ko'rish burchagi mavzusida qiziqarli faktlar...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"3-video. Perspektiv masshtablar 1-qism","Perspektiv masshtablar bilan ishlash borasida...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"4-video. Perspektiv masshtablar 2-qism","Perspektiv masshtablar bilan ishlash borasida...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"5-video. Qopqog'i ochilgan quti perspektivasi","Qopqog'i ochilgan quti perspektivasi ...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"6-video. Arxitektorlar usuli","Loyihalash amaliyotda o‘zining yasalishi jixatidan soddaligi sababli keng tarqalgan perspektiva...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"7-video. Radial nurlar izi usuli","Radial nurlar izi usuli ...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"8-video. To'rlar usuli","Mikrorayon,  xiyobonlar,  sport  komplekslari  va  shu  kabi  katta  maydonlarga  ega  bo'lgan  inshootlarning  perspektivasini  yasashda  to 'r  usuli  eng  qulay  usul hisoblanadi...",""));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        Intent intent = new Intent(getContext(), MainActivity4.class);
        intent.putExtra("data", modelRcycler.getLoadUrl());
        startActivity(intent);
    }
}