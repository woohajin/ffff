//drawble=ic_keyboard_arrow_left_black_24dp.xml

<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
    <path
        android:fillColor="#FF000000"
        android:pathData="M15.41,16.09l-4.58,-4.59 4.58,-4.59L14,5.5l-6,6 6,6z"/>
</vector>

//activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="edu.hansung.ait.myapplication.MainActivity">


    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start Fragment Activity"
        android:id="@+id/buttonSecondActivity"
        android:layout_marginTop="40dp"
        android:layout_alignParentStart="true"
        android:onClick="Start Fragment Activity"/>


</RelativeLayout>

//frag_a.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#c11f0d">
<TextView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/fragA"/>

</LinearLayout>

//frag_b.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#c11f0d">
<TextView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/fragA"/>

</LinearLayout>

//frag_c.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#0d37c1">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/fragC"/>

</LinearLayout>

//fragment.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="edu.hansung.ait.myapplication.FragActivity">

    <FrameLayout
        android:id="@+id/frame"
        android:layout_width="match_parent"
        android:layout_height="match_parent">


    </FrameLayout>


</LinearLayout>

//menu=main_menu.xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/action_fragA"
        android:title="FragA"/>
    <item
        android:id="@+id/action_fragB"
        android:title="FragB"/>
    <item
        android:id="@+id/action_fragC"
        android:title="FragC"/>
</menu>







