package kyoto.oldbigbuddha.freeprojects.hoge;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kyoto.oldbigbuddha.freeprojects.hoge.databinding.ActivityMainBinding;

/**
 * Created by developer on 17/06/25.
 * ViewClass
 * @author Big Buddha
 * @version 1.0.0
 */


public class MainActivity extends AppCompatActivity {

    /**
     * Viewの情報を保持している変数
     * */
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main);
        MainViewModel viewModel = new MainViewModel();
        binding.setViewModel( viewModel);
        binding.setCount( viewModel.count );
    }
}
