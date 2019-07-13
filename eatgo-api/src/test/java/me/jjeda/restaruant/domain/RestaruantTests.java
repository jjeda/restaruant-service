package me.jjeda.restaruant.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaruantTests {

    @Test
    public void creation() {
        Restaruant restaruant = new Restaruant(1004L,"a","seoul");
        assertThat(restaruant.getName(), is(""));
    }
}