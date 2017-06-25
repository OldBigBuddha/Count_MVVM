package kyoto.oldbigbuddha.freeprojects.hoge;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableInt;
import android.databinding.PropertyChangeRegistry;

/**
 * Created by developer on 17/06/25.
 * ModelClass
 * @author Big Bddha
 * @version 1.0.0
 */


public class Count implements Observable{

    /**
     * カウントを保持するための変数
     * 変更されると、自動で反映される
     */
    private ObservableInt count;
    /**
     * 変数の状態を監視しておくための変数
     * これがないとObservableのCallbackが管理できない
     * */
    private PropertyChangeRegistry registry;

    /**
     * コンストラクタ
     * 各変数の初期化
     * countの初期値は0
     * */
    public Count() {
        count = new ObservableInt(0);
        registry = new PropertyChangeRegistry();
    }

    /**
     * countをインクリメントするメソット
     * 計算後に#notifyChangeで更新する
     * */
    public void increment() {
        count.set(count.get() + 1);
        registry.notifyChange(this, BR.count);
    }

    /**
     * countをデクリメントするメソット
     * 計算後に#notifyChangeで更新する
     * */

    public void decrement() {
        count.set( count.get() - 1 );
        registry.notifyChange(this, BR.count);
    }

    /**
     * getter
     * @return 現在のcountに保持されている数値の文字列
     * */
    @Bindable
    public String getCount() {
        return count.get() + "";
    }

    /**
     * 変数が変更されたときに呼ばれるメソッド
     * 決まり文句
     * */
    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        registry.add( callback );
    }

    /**
     * 変数が破棄されたときに呼ばれるメソッド
     * 決まり文句
     * */
    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        registry.remove( callback );
    }
}
