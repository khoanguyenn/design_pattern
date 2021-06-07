package adapter_pattern.phone;

import adapter_pattern.MicroUsbPhone;

public class Huawei implements MicroUsbPhone {
    private boolean connector;

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }

    @Override
    public void useMicroUsb() {
        connector = true;
        System.out.println("MicroUsb connected");
    }    
}
