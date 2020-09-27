package sctu.java.day0923;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Panda extends Animal {
    @Override
    void play() {
        super.play();
        System.out.println("panda正在玩！");
    }

    public static void main(String[] args) {
        Panda b = new Panda();
        b.play();
    }
}
