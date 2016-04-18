package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.raymond.lab3.MainActivity;
import com.example.raymond.lab3.R;

import org.w3c.dom.Text;

import static com.example.raymond.lab3.MainActivity.sum;


/**
 * Created by Raymond on 4/17/2016.
 */

public class JUnit_test extends ActivityInstrumentationTestCase2 {
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }


    public void test_add() {
        mainActivity = (MainActivity) getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.textView2);
        String tester = textView.getText().toString();

        assertEquals("6", tester);
    }
}