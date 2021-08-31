package es.ifp.ahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    protected ImageView image1;
    protected TextView label1;
    protected TextView label2;
    protected TextView label3;
    protected EditText caja1;
    protected Button boton1;

    private String contenidoCaja1 = "";
    private int intentos = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.ima1_start);
        label1 = (TextView) findViewById(R.id.label1_start);
        label2 = (TextView) findViewById(R.id.label2_start);
        label3 = (TextView) findViewById(R.id.label3_start);
        caja1 = (EditText) findViewById(R.id.caja1_start);
        boton1 = (Button) findViewById(R.id.boton1_start);

        label3.setText("Te quedan " + intentos+ " intentos.");

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contenidoCaja1 = caja1.getText().toString();
                if (contenidoCaja1.equalsIgnoreCase("blanco")) {

                    boton1.setEnabled(false);
                    label3.setText("¡¡Yuhu!! ");

                }

                else {
                    if(intentos>0){
                        if(intentos==5)
                        {
                            image1.setImageResource(R.drawable.horca2);
                        }
                        else if(intentos==4)
                        {
                            image1.setImageResource(R.drawable.horca3);
                        }
                        else if(intentos==3)
                        {
                            image1.setImageResource(R.drawable.horca4);
                        }
                        else if(intentos==2)
                        {
                            image1.setImageResource(R.drawable.horca5);
                        }
                        else if(intentos==1)
                        {
                            image1.setImageResource(R.drawable.horca6);
                        }

                        intentos = intentos - 1;
                        label3.setText("Te quedan " + intentos+ " intentos.");

                    }
                    else
                    {
                        image1.setImageResource(R.drawable.horca7);
                        boton1.setEnabled(false);
                        label3.setText("¡No lo has conseguido! ");
                    }



                }

            }
        });
    }
}