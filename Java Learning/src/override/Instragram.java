package override;

public class Instragram {

	String Userid;
	long Cno;
	int NoOfPost;
	public Instragram(String userid, long cno, int noOfPost) {
		super();
		this.Userid = userid;
		this.Cno = cno;
		this.NoOfPost = noOfPost;
	}
	public int hascode()
	{
		int i=Object.hash(Userid,Cno,NoOfPost);
		return i;
	}

}
