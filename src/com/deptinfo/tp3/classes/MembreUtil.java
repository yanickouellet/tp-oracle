package com.deptinfo.tp3.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MembreUtil {
	
	Session session = null;
    
    public MembreUtil()
    {
        //this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void ajouterLivre(String titre, String isbn, Date dateParution)
    {

        BiArticles livre = new BiArticles();
        livre.setTitre(titre);
        livre.setIsbn(isbn);
        livre.setDateParution(dateParution);
        
        Transaction tx = null;
        
        try{    
            tx = session.beginTransaction();
			
			// l'ajout ne se fait pas car il reste des champs null qui ne doivent pas l'être
            session.saveOrUpdate(livre);
            tx.commit();
        }
        catch(Exception e)
        {
            tx.rollback();
            e.printStackTrace();
        }
        
    }
    
    public BiMembres getMembreConnectant(String login, String motPasse)
    {
        List<BiMembres> listeMembre = null; 
        BiMembres membre = null;
        try {
            // Liste de tous les livres
            // listeMembres = session.createQuery("from BiMembres").list();
            
            // Liste de tous les livres répondant au critère - Query
            Query q = session.createQuery("from BiMembres where login = :login and motpasse = :motpasse");
            q.setString("login", login);
            q.setString("motpasse", motPasse);
            listeMembre = q.list();
            
            // Liste de tous les livres répondant au critère - Criteria
           /* Criteria criteria = session.createCriteria(BiArticles.class);
            //criteria.add( Restrictions.like("isbn", "978-2-70964-192-0") );
            criteria.add( Restrictions.like("isbn", "%978%") );
            listeLivres = criteria.list();*/
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(listeMembre.size()==1)
        {
        	membre = listeMembre.get(0);
        }
        return membre;
    }
    

}
