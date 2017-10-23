import org.junit.Test;
import static org.junit.Assert.*;

// import GradleActivity;

public class GradleActivityTest{
    @Test
    public void testTri5(){
        assertEquals(GradleActivity.Tri(5), 15);
    }
    
    @Test 
    public void testTri1(){
        assertEquals(GradleActivity.Tri(1), 1);
    }
    
    @Test 
    public void testTri0(){
        assertEquals(GradleActivity.Tri(0), 0);
    }

    @Test
    public void testLazy0(){
        assertEquals(GradleActivity.Lazy(0),1);
    }

    @Test
    public void testLazy2(){
        assertEquals(GradleActivity.Lazy(2), 4);
    }

    @Test
    public void testLazy5(){
        assertEquals(GradleActivity.Lazy(5), 16);
    }
}