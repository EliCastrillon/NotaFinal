package com.elicastrillon.notafinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText eAvance1,eAvance2,eProyecto,eAppFinal,ePracticas;
Double avance1,avance2,proyecto,appFinal,practicas;
Double totalNotaF = 0.0;
Button eCalcular,eLimpiar,eSalir;
boolean comprovar=true;
boolean comprovar2 = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Castin
        eAvance1  = (EditText) findViewById (R.id.eAvance1);
        eAvance2 = (EditText) findViewById (R.id.eAvance2);
        eProyecto =(EditText) findViewById(R.id.eProyecto);
        eAppFinal = (EditText) findViewById(R.id.eAppFinal);
        ePracticas = (EditText) findViewById(R.id.ePracticas);
        eCalcular =(Button) findViewById(R.id.eCalcular);
        eLimpiar = (Button)findViewById(R.id.eLimpiar);
        eSalir = (Button) findViewById(R.id.eSalir);

     // Calcular nota final al dar clik
        eCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // vector para verificar que los campos no esten vacios
                String [] nulosV = {eAvance1.getText().toString(),eAvance2.getText().toString(),eProyecto.getText().toString(),
                        eAppFinal.getText().toString(),ePracticas.getText().toString()};



                // Metodo para comprovar campos vacios

                for(int j=0; j<=4;j++ ){
                    if(nulosV[j].equals("")){
                        Toast.makeText(getApplicationContext(),"Llenar Campos  Vacios", Toast.LENGTH_SHORT).show();
                        comprovar=false;

                    }else {

                    }
                }


               // ---Comprovando las notas de entrada que esten entre 0 y 5

                if(comprovar){
                    int i =0;
                 // cliclo para evaluar uno a uno que los valores esten entre 0 y 5
                 while (i<=4) {


                  if(i==0) {


                      if (0 <= Double.parseDouble(eAvance1.getText().toString()) && Double.parseDouble(eAvance1.getText().toString()) <= 5) {
                          avance1 = Double.parseDouble(eAvance1.getText().toString());
                      } else {
                          Toast.makeText(getApplicationContext(), "Las notas de entrada son entre 0 y 5", Toast.LENGTH_SHORT).show();
                          comprovar2 = false;
                      }

                  }
                  else if(i==1) {

                      if (0 <= Double.parseDouble(eAvance2.getText().toString()) && Double.parseDouble(eAvance2.getText().toString()) <= 5) {
                          avance2 = Double.parseDouble(eAvance2.getText().toString());

                      } else {
                          Toast.makeText(getApplicationContext(), "Las notas de entrada son entre 0 y 5", Toast.LENGTH_SHORT).show();
                          comprovar2 = false;
                      }
                  }
                  else if(i==2) {

                      if (0 <= Double.parseDouble(eProyecto.getText().toString()) && Double.parseDouble(eProyecto.getText().toString()) <= 5) {
                          proyecto = Double.parseDouble(eProyecto.getText().toString());
                      } else {
                          Toast.makeText(getApplicationContext(), "Las notas de entrada son entre 0 y 5", Toast.LENGTH_SHORT).show();
                          comprovar2 = false;
                      }
                  }
                  else if(i==3) {

                      if (0 <= Double.parseDouble(eAppFinal.getText().toString()) && Double.parseDouble(eAppFinal.getText().toString()) <= 5) {
                          appFinal = Double.parseDouble(eAppFinal.getText().toString());
                      } else {
                          Toast.makeText(getApplicationContext(), "Las notas de entrada son entre 0 y 5", Toast.LENGTH_SHORT).show();
                          comprovar2 = false;
                      }
                  }

                  else {

                      if (0 <= Double.parseDouble(ePracticas.getText().toString()) && Double.parseDouble(ePracticas.getText().toString()) <= 5) {
                          practicas = Double.parseDouble(ePracticas.getText().toString());
                      } else {
                          Toast.makeText(getApplicationContext(), "Las notas de entrada son entre 0 y 5", Toast.LENGTH_SHORT).show();
                          comprovar2 = false;
                      }

                  }




                     i++;

                     }

                }else {}


                // evaluando las nota final
                if (comprovar2){

                    try {
                        totalNotaF = 0.05 * avance1 + 0.07 * avance2 + 0.08 * proyecto + 0.2 * proyecto + 0.6 * practicas;


                        if (0 <= totalNotaF && totalNotaF <= 1) {

                            Toast.makeText(getApplicationContext(), "“Estas en el lugar equivocado”", Toast.LENGTH_SHORT).show();

                        }
                        else if (1.1 <= totalNotaF && totalNotaF <= 2){
                            Toast.makeText(getApplicationContext(), "“Remal”", Toast.LENGTH_SHORT).show();
                        }
                        else if (2.1 <= totalNotaF && totalNotaF <= 3){
                            Toast.makeText(getApplicationContext(), "“Es posible recuperarse”", Toast.LENGTH_SHORT).show();
                        }
                        else if (3.1 <= totalNotaF && totalNotaF <= 4){
                            Toast.makeText(getApplicationContext(), "“Normalito”", Toast.LENGTH_SHORT).show();
                        }
                        else if (4.1 <= totalNotaF && totalNotaF <= 4.5){
                            Toast.makeText(getApplicationContext(), "“Muy Bien”", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "“Excelente estudiante”", Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception e){

                    }


                }else {

                }




                 comprovar=true;
                 comprovar2 = true;
            }
        });


        // Boton salir

        eSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Boton limpiar campos
      eLimpiar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              eAvance1.setText("");
              eAvance2.setText("");
              eProyecto.setText("");
              eAppFinal.setText("");
              ePracticas.setText("");

          }
      });




    }




    }



