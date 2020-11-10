package eslam.com.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        new Thread(new Runnable() {
            @Override
            public void run() {

                try{

                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    int x=300/0;
                }catch (ArithmeticException e){
//                    Toast.makeText(splashScreen.this, "Craaaaaash ya7omar", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
                Intent intent=new Intent(splashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }


        }).start();



    }
}
