package uz.ithelp.perspektiva.ui.gallery;

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

        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey sadfsdofj sdfjsdiopjsodijfds ssdfijsdijfds...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"SALOM","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

    }
}