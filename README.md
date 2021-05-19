# rpsgame
アプリケーションの名前：じゃんけんゲーム<br/>
概要：ラジオボタンを使用したじゃんけんゲーム<br/>
使用技術：Java(サーブレット,JavaBeans)　JavaScript　　<br/>
目的：サーブレットとJavaBeansを使用してアルゴリズムの初歩であるじゃんけんゲームを動的webページで表示させる。<br/>
作成時間：2時間弱<br/>
工夫した点：<br/>
・簡単だがレスポンシブ対応させた点<br/>
・じゃんけんの勝敗結果を表示させるアルゴリズムを、配列を使用してすぐに表示できるようした点。<br/>
・ラジオボタンを押さないで結果表示を押すとエラーになるのでJavaScriptでラジオボタンを必ず押すようエラー文を表示させた点。<br/>
・サーブレットに直接アクセスされた場合やJavaScriptを切ってラジオボタンを押さないで結果表示させた場合にエラーページに飛ぶようにした点。<br/>
苦労した点：<br/>
・じゃんけんのアルゴリズムに関して、最初はswitch文を用いてグー・チョキ・パーに分けようと考えたが配列を使用すればswitch文を用いなくても分けれることに気付くのに時間がかかった点。<br/>
・当初は結果表示を別ページで表示させようとしたが、jspファイル内にif文を用いれば同じページに結果を表示させれることに気付くのに時間がかかった点。
