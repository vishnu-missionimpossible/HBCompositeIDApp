package in.ineuron.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ProgrammerProjectInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProjectInfo info;
	
	@Column(name="pname", length = 20)
	private String programmerName;
	
	@Column(name="depNo")
	private Integer depNo;
	
	@Column(name="projName", length = 20)
	private String projectName;
	
	
	
	public ProgrammerProjectInfo(ProjectInfo info, String programmerName, Integer depNo, String projectName) {
		super();
		this.info = info;
		this.programmerName = programmerName;
		this.depNo = depNo;
		this.projectName = projectName;
	}
	
	@Override
	public String toString() {
			return "ProgrammerProjectInfo [programmerName=" + programmerName + ", depNo=" + depNo + ", projectName="
					+ projectName + "]";
		}
	
	

}
