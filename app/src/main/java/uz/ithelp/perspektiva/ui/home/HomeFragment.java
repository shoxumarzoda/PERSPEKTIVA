package uz.ithelp.perspektiva.ui.home;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.perspektiva.R;
import uz.ithelp.perspektiva.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    int getChemgeItemPosition;

    ConstraintLayout constraintLayout;
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));
        modelRcyclers.add(new ModelRcycler(R.drawable.author,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","file:///android_asset/Kirish.htm"));


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