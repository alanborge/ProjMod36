/**
 * 
 */
package br.com.rpires.jpa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author rodrigo.pires
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteJpaDao2BancosTest.class, ClienteJpaDao3BancosTest.class,
ClienteJpaDaoTest.class, ProdutoJpaDAOTest.class,
VendaJpaDAOTest.class})
public class AllTests {

}
