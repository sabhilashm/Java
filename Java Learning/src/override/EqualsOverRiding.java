package override;

public class EqualsOverRiding {
	String userId;
	long cno;
	int numberOfPost;
	@Override
	public String toString() {
		return "EqualsOverRiding [userId=" + userId + ", cno=" + cno + ", numberOfPost=" + numberOfPost + "]";
	}
	public EqualsOverRiding(String userId, long cno, int numberOfPost) {
		super();
		this.userId = userId;
		this.cno = cno;
		this.numberOfPost = numberOfPost;
	}
	
	@Override
	public boolean equals(Object o) {
		EqualsOverRiding i=(EqualsOverRiding)o;
		if(this.userId.equals(i.userId)&&this.cno==i.cno&&this.numberOfPost==i.numberOfPost)
		{
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	

}
