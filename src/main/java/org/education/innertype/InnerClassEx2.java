package org.education.innertype;

public class InnerClassEx2 {
    public static void main(String[] args)
    {
        A a = new A();
        A.B b = a.new B();
        b.setM_x(100);
        int result = b.getM_x();
        System.out.println(result);

    }
}

class A {
    public class B {
        private int m_x;
        public void foo()
        {
            System.out.println("A.B foo");
        }

        public int getM_x()
        {
            return m_x;
        }

        public void setM_x(int m_x)
        {
            this.m_x = m_x;
        }
    }
}
