package project15;
import java.awt.*;
import java.awt.event.*;
//Frame�̋@�\���擾���邽�߂Ɍp������B
public class kokyu extends Frame {
 //�t�B�[���h�ϐ��Ƀ{�^�����w�肷��B
private Button btn;

	public static void main(String[] args) {
		// �f�o�b�O�Ɠ�����UI�t�H�[���������������邽�߁A�C���X�^���X�ŃR���X�g���N�^������B
        kokyu ku = new kokyu();
	}
	//�R���X�g���N�^���ă{�^����UI�t�H�[���𐶐��A����ɂ��͂Ƃ���������\��������B
	public kokyu(){
	
	btn = new Button("����ɂ��́B");
	add(btn);
	//addwindowLisetener�Ńt�H�[�������@�\��ǉ��B
	addWindowListener(new SampleWindowListener());
	//addMouseListner�Ń}�E�X�ɂ���ĕ�����؂�ւ���C�x���g��ǉ�
	btn.addMouseListener(new SampleMouseListener());
	//�t�H�[���̃T�C�Y��setSize�Ō��߂�B
	setSize(250,200);
	//�t�H�[���̕\����ON�ɂ���B
	setVisible(true);
}
	
 class SampleWindowListener extends WindowAdapter
 {
    public void windowClosing(WindowEvent e)
	 {
		//x�{�^�����������ƂŃt�H�[���������B
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
	//�}�E�X�̃J�[�\�����t�H�[�����ɓ���ƕ������u��������Ⴂ�܂��v�Ɛ؂�ւ��B�imouseEntered�Łj
	 btn.setLabel("��������Ⴂ�܂��B");
 }
 public void mouseExited(MouseEvent e)
 {
	//�}�E�X�̃J�[�\��������邱�ƂŁu�悤�����v�ɕ������؂�ւ��B�imouseExited)
	 btn.setLabel("�悤����");
 }
}
 
	

	
	
	

}
