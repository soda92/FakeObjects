package org.example;

import junit.framework.TestCase;

public class SaleTestMockDisplayTest extends TestCase {
    public void testDisplayAnItem() {
        MockDisplay display = new MockDisplay();
        display.setExpectation("showLine", "Milk $3.99");
        Sale sale = new Sale(display);
        sale.scan("1");
        assertTrue(display.verify());
    }
}
