package DefenseObservable;

import DefenseObserver.DefenseObserver;
import GUI.HelicopterView;
import GUI.TankView;
import GUI.SubmarineView;
import MilitaryVehicleEnum.MilitaryVehicle;
import DefenseObservableInterface.DefenseObservableInterface;
import GUI.MainControllerView;
//import GUI.MainControllerView;

/**
 *
 * @author Sahan Chamara
 */
// This is the Main Controller of the Defense System........
public class DefenseObservable implements DefenseObservableInterface {
    
    private DefenseObserver[] defenseObserverArr;
    private int position;
    private boolean isSelectedArea;
    private String msg;
    private String vehicleSend;
//    private String comingMsg;
//    private String getMsg;

    public DefenseObservable() {
        this.defenseObserverArr = new DefenseObserver[0];
    }

    public void addDefense(DefenseObserver ob) {
        extendObserverArr();
        defenseObserverArr[defenseObserverArr.length - 1] = ob;
    }

    public void extendObserverArr() {
        DefenseObserver[] tempObserverArr = new DefenseObserver[defenseObserverArr.length + 1];
        for (int i = 0; i < defenseObserverArr.length; i++) {
            tempObserverArr[i] = defenseObserverArr[i];
        }
        defenseObserverArr = tempObserverArr;
    }

    @Override
    public void setSliderPosition(int position) {
        if (this.position != position) {
            this.position = position;
        }
        notifyPosition();
    }

    public void notifyPosition() {
        for (DefenseObserver defense : defenseObserverArr) {
            defense.defense(position);
        }
    }

    @Override
    public void setArea(boolean isSelected) {
        if (this.isSelectedArea != isSelected) {
            this.isSelectedArea = isSelected;
        }
        notifyArea();
    }

    public void notifyArea() {
        for (DefenseObserver defense : defenseObserverArr) {
            defense.setAreaText(isSelectedArea);
        }
    }

    @Override
    public void setSendMsg(String msg) {
        this.msg = msg;
        notifyMsgMain();
    }

    public void notifyMsgMain() {
        for (DefenseObserver defense : defenseObserverArr) {
            defense.setSendMsg(msg);
        }
    }
    
    public void militaryVehicleSendMsg(String msg){
        this.vehicleSend=msg;
        MainControllerView instance = MainControllerView.getInstance();
        instance.setComingMsg(vehicleSend);
    }
    
    

}
