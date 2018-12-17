package com.xyxj.samples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xyxj.show.CodeShowAppCompatActivity;

public class MainActivity extends CodeShowAppCompatActivity {

    @Override
    protected Fragment getViewFragment() {
        return new ViewFragment();
    }

    @Override
    protected String getCodeText() {
        return "package com.xyxj.samples;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.support.annotation.NonNull;\n" +
                "import android.support.annotation.Nullable;\n" +
                "import android.support.v4.app.Fragment;\n" +
                "import android.support.v7.widget.LinearLayoutCompat;\n" +
                "import android.view.Gravity;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "import com.xyxj.show.CodeShowAppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends CodeShowAppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected Fragment getViewFragment() {\n" +
                "        return new ViewFragment();\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public static final class ViewFragment extends Fragment {\n" +
                "\n" +
                "        @NonNull\n" +
                "        @Override\n" +
                "        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
                "            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext());\n" +
                "            TextView tv = new TextView(getContext());\n" +
                "            tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));\n" +
                "            tv.setGravity(Gravity.CENTER);\n" +
                "            tv.setText(\"这是展示的效果\");\n" +
                "            linearLayoutCompat.addView(tv);\n" +
                "            return linearLayoutCompat;\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

    public static final class ViewFragment extends Fragment {

        @NonNull
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext());
            TextView tv = new TextView(getContext());
            tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            tv.setGravity(Gravity.CENTER);
            tv.setText("这是展示的效果");
            linearLayoutCompat.addView(tv);
            return linearLayoutCompat;
        }
    }
}
