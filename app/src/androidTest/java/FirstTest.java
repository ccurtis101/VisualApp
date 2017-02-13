/**
 * Created by chriscurtis on 13/02/2017.
 */
////https://developer.android.com/training/testing/unit-testing/local-unit-tests.html#build

////http://wptrafficanalyzer.in/blog/android-testing-example-helloworld-with-activityunittestcase/

import android.test.ActivityUnitTestCase;

import com.example.chriscu.visualapp.MainActivity;

import org.junit.Test;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import android.content.Intent;
import android.widget.TextView;


public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {




    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);



        // Activity of the Target application
        MainActivity mainActivity;

        // TextView of the MainActivity to be tested
        TextView tvHello;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Starts the MainActivity of the target application
        startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);

        // Getting a reference to the MainActivity of the target application
        mainActivity = (MainActivity)getActivity();

        // Getting a reference to the TextView of the MainActivity of the target application
        tvHello = (TextView) mainActivity.findViewById(in.wptrafficanalyzer.helloworld.R.id.hello_world);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testHello(){
        // The actual text displayed in the textview
        String actual=tvHello.getText().toString();

        // The expected text to be displayed in the textview
        String expected = "Hello world!";

        // Check whether both are equal, otherwise test fails
        assertEquals(expected,actual );
    }


}
