/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guilh
 */
public class TG6Test {
    
    TG6 sut;
    
    public TG6Test() {
        sut = new TG6();
    }

    @Test
    public void testEmprestimo() {
        assertEquals(true, sut.emprestimo(1001, true, true));
        assertEquals(true, sut.emprestimo(1100, true, false));
        assertEquals(true, sut.emprestimo(1201, false, true));
        assertEquals(true, sut.emprestimo(2001.11, false, false));
        
        assertEquals(true, sut.emprestimo(900, true, true));
        assertEquals(true, sut.emprestimo(0, true, false));
        assertEquals(true, sut.emprestimo(-43.2, false, true));
        assertEquals(false, sut.emprestimo(820, false, false));
    }
}
