package eslam.com.temperatureconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

//    private EditText et_Temperature;
//    private Button btn_C ,btn_F ;
//    private TextView tv_Result;
//
//    DecimalFormat decimalFormat=new DecimalFormat("0.0");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





//        et_Temperature=findViewById(R.id.et_temp);
//        btn_C=findViewById(R.id.btn_C);
//        btn_F=findViewById(R.id.btn_F);
//        tv_Result=findViewById(R.id.tv_Result);

//        btn_C.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            String intEditText =et_Temperature.getText().toString();
//            if (intEditText.isEmpty()){
//                Toast.makeText(MainActivity.this, "Please Enter Value", Toast.LENGTH_SHORT).show();
//            }
//            else {
//
//                double intParseEditText =Double.parseDouble(intEditText);
//                double convertedVal=(convertToCelsius(intParseEditText));
//                String stringResult=(decimalFormat.format(convertedVal));
//                tv_Result.setText(stringResult+"C");
//
//            }
//
//            }
//        });

//        btn_F.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String intEditText =et_Temperature.getText().toString();
//                if (intEditText.isEmpty()){
//                    Toast.makeText(MainActivity.this, "Please Enter Value", Toast.LENGTH_SHORT).show();
//                }
//                else {
//
//                    double intParseEditText =Double.parseDouble(intEditText);
//                    double convertedVal=(convertToFahrenheit(intParseEditText));
//                    String stringResult=(decimalFormat.format(convertedVal));
//                    tv_Result.setText(stringResult+"F");
//
//                }
//
//
//            }
//        });


    }

//    public double convertToCelsius (double CelVal){
///*
//from Fahrenheit to Celsius ---> (F -32) * 5/9
//from Celsius to Fahrenheit ---> c * 9/5 +
// */
//        double resultCelsius ;
//        resultCelsius=(CelVal-32)*5/9;
//
//        return resultCelsius;
//
//    }
//
//    public double convertToFahrenheit(double FarVal){
//
//        double resultFahrenheit;
//        resultFahrenheit=(FarVal*9/5)+32;
//
//        return resultFahrenheit;
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();

    }
}
