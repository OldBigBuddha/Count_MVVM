package kyoto.oldbigbuddha.freeprojects.hoge;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static kyoto.oldbigbuddha.freeprojects.hoge.BR.count;

/**
 * Created by developer on 17/06/25.
 * ViewModelClass
 * @author Big Buddha
 * @version 1.0.0
 */

public class MainViewModel {

    /**
     * ModelClass
     * 現在の数値を保持する
     * その数値に対する処理も書いてある
     * */
    Count count;

    /**
     * インストラクタ
     * countの初期化
     * */
    public MainViewModel() {
        count = new Count();
    }

    /**
     * btPlusのOnClickメソッド
     * インクリメントの呼び出しのみ
     * */
    public void onClickPlus(View view) {
        count.increment();
    }

    /**
     * btMinusのOnClickメソッド
     * デクリメントの呼び出しのみ
     * */
    public void onClickMinus(View view) {
        count.decrement();
    }

    }
