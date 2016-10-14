 //manifests
 
 <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".FragActivity"
            android:parentActivityName=".MainActivity" />
    </application>

</manifest>

//FragA.java

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragA extends Fragment {
    public FragA() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a, container, false);
        return view;
    }
}


//FragActivity

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class FragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.addToBackStack(null);
        switch (item.getItemId()) {

            case R.id.action_fragA:
                fragmentTransaction.replace(R.id.frame , new FragA()).addToBackStack(null).commit();;
                return true;
            case R.id.action_fragB:
                fragmentTransaction.replace(R.id.frame, new FragB()).addToBackStack(null).commit();;
                return true;
            case R.id.action_fragC:
                fragmentTransaction.replace(R.id.frame, new FragC()).addToBackStack(null).commit();;
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

//FragB.java

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragB extends Fragment {
    public FragB() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_b, container, false);
        return view;
    }
}

//FragC.java

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragC extends Fragment {
    public FragC() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_c, container, false);
        return view;
    }
}


//MainActivity

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        btn = (Button)findViewById(R.id.buttonSecondActivity);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             Intent intent =  new Intent(getApplicationContext(), FragActivity.class);
                startActivity(intent);
            }
        });
    }

}

//



