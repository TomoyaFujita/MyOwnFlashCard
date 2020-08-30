package net.minpro.myownflashcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_word_list.*

class WordListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_list)

        //Todo 画面が開いたとき
        //Todo 1.DBに登録している単語を一覧表示(ListView)
        //Todo 2.前画面で設定した背景色を設定
        ConstraintLayoutWordList.setBackgroundResource(intBackGroundColor)


        //ボタンのクリック処理
        //「新しい単語の追加」ボタンを押した場合
        // 「EditActivity」へ（ステータスをIntentで渡す）
        buttonAddNewWord.setOnClickListener {
            val intent = Intent(this@WordListActivity, EditActivity::class.java)
            intent.putExtra(getString(R.string.intent_key_status), getString(R.string.status_add))
            startActivity(intent)
        }

        //「もどる」ボタンを押した場合
        // 今の画面を閉じて「MainActivity」へ
        buttonBack.setOnClickListener {
            finish()
        }
    }



    //Todo  リスト内の単語をタップした場合
    //   Todo 1.タップした項目をDBから取得
    //   Todo 2.EditActivity(単語編集画面)を開く
    //         ＝＞１で取得した情報(問題/こたえ/行番号)と
    //               ステータスをIntentで渡す

    //Todo  リスト内の単語を長押しした場合
    //   Todo 1.長押しした項目をDBから取得
    //   Todo 2.1で取得した内容をDBから削除
    //   Todo 3.1で取得した内容を一覧(リスト)からも削除
    //   Todo 4.DBから単語帳データを再取得して表示

    //Todo「新しい単語の追加」ボタンを押した場合
    //   Todo「EditActivity」へ（ステータスをIntentで渡す）

    //Todo「もどる」ボタンを押した場合
    //   Todo 今の画面を閉じて「MainActivity」へ

}