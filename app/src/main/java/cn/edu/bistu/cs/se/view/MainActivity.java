package cn.edu.bistu.cs.se.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne=(Button)findViewById(R.id.button);
        final TextView txtResult=(TextView)findViewById(R.id.textView3);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "填写信息成功");
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }




        return super.onOptionsItemSelected(item);
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if(checked){
                    Toast.makeText(this,"选择唱歌",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择唱歌",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox2:
                if(checked){
                    Toast.makeText(this,"选择跳舞",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择跳舞",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox3:
                if(checked){
                    Toast.makeText(this,"选择画画",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择画画",Toast.LENGTH_LONG).show();
                }

        }
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonMale:
                if (checked)
                    textView.setText("您的性别为男");
                break;
            case R.id.radioButtonFemale:
                if (checked)
                    textView.setText("您的性别为女");
                break;
        }
    }


}
