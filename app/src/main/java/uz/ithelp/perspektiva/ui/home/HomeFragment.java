package uz.ithelp.perspektiva.ui.home;


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

import uz.ithelp.perspektiva.MainActivity2;
import uz.ithelp.perspektiva.MainActivity3;
import uz.ithelp.perspektiva.R;
import uz.ithelp.perspektiva.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.lgo,"Kirish","Perspektiva fransuzcha so‘z bo‘lib, “la perspective” - uzoqqa qarash, yunonchasiga esa “perspictor” - oyna orqali to‘g‘ri va aniq ko‘rayapman degan ma‘noni bildiradi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/kirish.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ikki,"I BOB.\tPERSPEKTIVA VA UNING TURLARI. PERSPEKTIVANING GEOMETRIK APPARATI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.uch,"II BOB.\tTO’G’RI CHIZIQ VA TEKISLIKNING PERSPEKTIV TASVIRI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.turt,"III BOB.\tPERSPEKTIVADA POZITSION VA METRIK MASALALAR YECHISH","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.besh,"IV BOB.\tPERSPEKTIV TASVIR QURISH USULLARI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.olt,"V BOB.\tMARKAZIY PROYEKSIYALASHDA SOYALAR YASASH NAZARIYASI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.yet,"VI BOB.\tAKS TASVIRLARNING PERSPEKTIVASI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.sak,"VII BOB.\tGRAFIK ISH TOPSHIRIQLARINI BAJARISHGA OID METODIK TAVSIYALAR","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.ki,"PERSPEKTIVA ATAMALARI VA TUSHUNCHALARI BO‘YICHA YIG‘MA LUG‘AT","","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/izohli.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuqq,"ADABIYOTLAR","1. Murodov Sh.K. va boshqalar “Chizma geometriya”.-Т.: “Iqtisod-moliya”. 2006-y.\n" +
                "2. Qulnazarov B.B. “Chizma geometriya”.-T.: “O’zbekistan”. 2006-y.\n","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/adabiyot.pdf"));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (modelRcycler.getLessonName().toLowerCase().startsWith("kirish") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("pers") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("adabiyot")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

          startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));


        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}