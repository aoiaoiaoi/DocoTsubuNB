/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MutterDAO;
import java.util.List;

/**
 *
 * @author aoi
 */
public class PostMutterLogic {
    //public void execute(Mutter mutter, List<Mutter> mutterList) {
    public void execute(Mutter mutter) {
        MutterDAO dao = new MutterDAO();
        //mutterList.add(0, mutter);
        dao.create(mutter);
    }
}
