package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.ProgrammerProjectInfo;
import in.ineuron.Model.ProjectInfo;
import in.ineuron.util.HibernateUtil;

public class CompositeKeyApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		
		boolean flag=false;
		
		try {
			
			session = HibernateUtil.getSession();
			if (session != null) 
				transaction=session.beginTransaction();
				if (transaction != null) {
					ProjectInfo info=new ProjectInfo(101,903);
					ProgrammerProjectInfo projectDetails = new ProgrammerProjectInfo(info, "ravi", 20, "jee");
					ProjectInfo id=(ProjectInfo)session.save(projectDetails);
					System.out.println("The generated value is ::"+id);
					flag = true;
				}
				
			
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			    if(flag) {
			    	transaction.commit();
			    	System.out.println("Object saved successfully...");
			    }else {
			    	transaction.rollback();
			    	System.out.println("Object failed to Save...");
			    }
			    HibernateUtil.closeSession(session);
			}

	}

}
