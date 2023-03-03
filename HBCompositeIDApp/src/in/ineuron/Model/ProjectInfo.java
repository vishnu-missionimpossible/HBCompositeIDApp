package in.ineuron.Model;

import java.io.Serializable;

import javax.persistence.Column;

public class ProjectInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="pid")
   private Integer pid;
	
	@Column(name = "pgmid")
   private Integer pgmId;
	
	
	public ProjectInfo(){
		
	}
	
		public ProjectInfo(Integer pid, Integer pgmId) {
		super();
		this.pid = pid;
		this.pgmId = pgmId;
	}
		
		@Override
		public String toString() {
			return "ProjectInfo [pid=" + pid + ", pgmId=" + pgmId + "]";
		}
   
}
