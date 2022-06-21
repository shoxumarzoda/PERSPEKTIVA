package uz.ithelp.perspektiva;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));


        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I BOB.\tPERSPEKTIVA VA UNING TURLARI. PERSPEKTIVANING GEOMETRIK APPARATI");

                modelRcyclers.add(new ModelRcycler("1.1-§. Perspektivaning maqsad va vazifalari. Perspektiva turlari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("1.2-§. Perspektiv tasvir yasashning geometrik apparati va uning asosiy terminlari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/1.2.pdf"));
                modelRcyclers.add(new ModelRcycler("1.3-§. Nuqtaning perspektiv tasviri","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/1.3.pdf"));

            }break;
            case 2: {

                textViewSelectedChapterName.setText("II BOB.\tTO’G’RI CHIZIQ VA TEKISLIKNING PERSPEKTIV TASVIRI");

                modelRcyclers.add(new ModelRcycler("2.1-§.To‘g‘ri chiziqning perspektiv tasviri","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2.2-§. Tekislikning perspektiv tasvirini yasash algoritm","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));

            }break;

            case 3: {

                textViewSelectedChapterName.setText("III BOB.\tPERSPEKTIVADA POZITSION VA METRIK MASALALAR YECHISH");

                modelRcyclers.add(new ModelRcycler("3.1-§.  Perspektivada pozitsion (vaziyatli) masalalar yechish","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.1.pdf"));
                modelRcyclers.add(new ModelRcycler("3.2-§.  Perspektivada metrik (o‘lchashli) masalalar yechish","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.2.pdf"));

            }break;
            case 4: {

                textViewSelectedChapterName.setText("IV BOB.\tPERSPEKTIV TASVIR QURISH USULLARI");

                modelRcyclers.add(new ModelRcycler("4.1-§. Ko‘rish nuqtasini tanlash va eng yaxshi ko‘rish burchagi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.1.pdf"));
                modelRcyclers.add(new ModelRcycler("4.2-§. Perspektiv tasvir qurish usullari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.2.pdf"));
                modelRcyclers.add(new ModelRcycler("4.3-§. Interyer perspektivasini qurish","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));


            }break;
            case 5: {

                            textViewSelectedChapterName.setText("V BOB.\tMARKAZIY PROYEKSIYALASHDA SOYALAR YASASH NAZARIYASI");

                            modelRcyclers.add(new ModelRcycler("5.1-§. Soyalar nisbatining miqdoriy ko’rsatkichlari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.1.pdf"));
                            modelRcyclers.add(new ModelRcycler("5.2-§. Markaziy proyeksiyalashda soya bajarish","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.2.pdf"));
                            modelRcyclers.add(new ModelRcycler("5.3-§. Sun’iy (markaziy) yoritishda soyalar yasash","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.3.pdf"));
                            modelRcyclers.add(new ModelRcycler("5.4-§. Tabiiy yorug’lik manbai quyoshning asosiy vaziyatlari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.4.pdf"));
                            modelRcyclers.add(new ModelRcycler("5.5-§. Tabiiy (parallel) yoritishda soyalar yasash","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.5.pdf"));

                        }break;
            case 6: {

                            textViewSelectedChapterName.setText("VI BOB.\tAKS TASVIRLARNING PERSPEKTIVASI");

                            modelRcyclers.add(new ModelRcycler("6.1-§. Aks tasvirlarning perspektivasi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.1.pdf"));
                            modelRcyclers.add(new ModelRcycler("6.2-§. Ko‘zgu tekisliklarida aks tasvirlarni yasash. Vertikal va og‘ma ko‘zgularda aks tasvir yasash","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.2.pdf"));
                            modelRcyclers.add(new ModelRcycler("6.3-§. Suv yuzasida aks tasvir yasash","fhttps://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.3.pdf"));

                        }break;
            case 7: {

                            textViewSelectedChapterName.setText("VII BOB.\tGRAFIK ISH TOPSHIRIQLARINI BAJARISHGA OID METODIK TAVSIYALAR");

                            modelRcyclers.add(new ModelRcycler("1-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.1.pdf"));
                            modelRcyclers.add(new ModelRcycler("2-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.2.pdf"));
                            modelRcyclers.add(new ModelRcycler("3-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.3.pdf"));
                            modelRcyclers.add(new ModelRcycler("4-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.4.pdf"));
                            modelRcyclers.add(new ModelRcycler("5-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.5.pdf"));
                            modelRcyclers.add(new ModelRcycler("6-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.6.pdf"));
                            modelRcyclers.add(new ModelRcycler("7-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.7.pdf"));
                            modelRcyclers.add(new ModelRcycler("8-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.8.pdf"));
                            modelRcyclers.add(new ModelRcycler("9-GRAFIK ISH","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/7.9.pdf"));

                        }break;

        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}