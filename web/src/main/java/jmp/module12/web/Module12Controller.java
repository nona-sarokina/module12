package jmp.module12.web;

import jmp.module12.domain.Module12Data;
import jmp.module12.service.Module12DataFiller;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 * Created by user on 14.10.2016.
 */
@ManagedBean
@RequestScoped
public class Module12Controller {

    public Module12Data getModuleInfo () {
        Module12DataFiller filler = new Module12DataFiller();
        filler.fill();
        return filler.getData();
    }
}
