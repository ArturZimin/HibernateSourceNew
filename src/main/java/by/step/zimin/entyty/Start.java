package by.step.zimin.entyty;


import org.hibernate.Session;

public class Start {

    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession().getSessionFactory().openSession();
        System.out.println("new AuthorHelper().getAuthorList()= "+new AuthorHelper().getAuthorList());
    }
}
