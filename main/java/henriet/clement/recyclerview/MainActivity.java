package henriet.clement.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    
    private List<ListItem> listItems;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //on récupère le recyclerView du fichier xml ou se trouve le widget recyclerView, ici activity.main
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //chaque élément de la recycler view aura une taille fixe
        recyclerView.setHasFixedSize(true);
        //crée le layout du recyclerView avec le contexte actuel (this)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        //on va mettre dans cette listItem toutes les données qu'on voudra afficher dans le recyclerView
        listItems = new ArrayList<>();
        
        //crée des données bateau pour peupler la liste
        for(int i = 0; i<=10; i++)
        {
             ListItem listItem = new ListItem(
               "Heading_" + (i+1),
               "dummy text"
             );
             //on ajoute le listeItems à la liste
             listItems.add(listItem);
        }
        
        //défini l'adapteur. on lui donne les données (la liste) et le context (this)
        adapter = new MyAdapter(listItems, this);
        //attache l'adapter au recyclerView
        recyclerView.setAdapter(adapter);
    }
    
}
