package project15;
import java.awt.*;
import java.awt.event.*;
//Frameの機能を取得するために継承する。
public class kokyu extends Frame {
 //フィールド変数にボタンを指定する。
private Button btn;

	public static void main(String[] args) {
		// デバッグと同時にUIフォームを自動生成するため、インスタンスでコンストラクタさせる。
        kokyu ku = new kokyu();
	}
	//コンストラクタしてボタンのUIフォームを生成、こんにちはという文字を表示させる。
	public kokyu(){
	
	btn = new Button("こんにちは。");
	add(btn);
	//addwindowLisetenerでフォームを閉じる機能を追加。
	addWindowListener(new SampleWindowListener());
	//addMouseListnerでマウスによって文字を切り替えるイベントを追加
	btn.addMouseListener(new SampleMouseListener());
	//フォームのサイズをsetSizeで決める。
	setSize(250,200);
	//フォームの表示をONにする。
	setVisible(true);
}
	
 class SampleWindowListener extends WindowAdapter
 {
    public void windowClosing(WindowEvent e)
	 {
		//xボタンを押すことでフォームを消す。
    	System.exit(0); 
	 }
 }
	
class SampleMouseListener implements MouseListener
{
 public void mouseClicked(MouseEvent e){}
 public void mouseReleased(MouseEvent e) {}
 public void mousePressed(MouseEvent e) {}
 public void mouseEntered(MouseEvent e)
 {
	//マウスのカーソルがフォーム内に入ると文字が「いらっしゃいませ」と切り替わる。（mouseEnteredで）
	 btn.setLabel("いらっしゃいませ。");
 }
 public void mouseExited(MouseEvent e)
 {
	//マウスのカーソルが離れることで「ようこそ」に文字が切り替わる。（mouseExited)
	 btn.setLabel("ようこそ");
 }
}
 
	

	
	
	

}
