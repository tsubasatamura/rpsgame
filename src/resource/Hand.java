package resource;
import java.io.Serializable;
public class Hand implements Serializable{
	private static final long serialVersionUID=1L;
	private String yourhandstr;
	private String cpuhandstr;
	private String[] HAND={"グー","チョキ","パー"};//手を簡単に決めるため設定
	private String result;
	private final String[] RESULT={"あなたの勝ちです","あなたの負けです","あいこです"};
	//resultを簡単に決めるため設定
	private int standing;
	private final int[][] STANDING={{2,0,1},//勝敗表を3×3の2次元配列で表現
						            {1,2,0},
						            {0,1,2}};

	public Hand(){
		super();
	}

	public String getYourhandstr() {
		return yourhandstr;
	}

	public void setYourhandstr(int yourhand) {
		this.yourhandstr=HAND[yourhand];
	}

	public String getCpuhandstr() {
		return cpuhandstr;
	}

	public void setCpuhandstr(int cpuhand) {
		this.cpuhandstr=HAND[cpuhand];
	}

	public String getResult() {
		return result;
	}

	public void setResult(int standing) {
		this.result=RESULT[standing];
	}

	public int getStanding() {
		return standing;
	}

	public void setStanding(int yourhand,int cpuhand) {
		this.standing = STANDING[yourhand][cpuhand];
	}

}
