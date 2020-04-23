package com.example.chhv.clb.OrganizationsBD.controller;

import com.example.chhv.clb.OrganizationsBD.DAO.OrganizationDAO;
import com.example.chhv.clb.OrganizationsBD.beans.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OrganizationController {

    final
    OrganizationDAO dao;

    public OrganizationController(OrganizationDAO dao) {
        this.dao = dao;
    }

    @RequestMapping("/orgform")
    public String showForm(Model m) {
        m.addAttribute("command", new Organization());
        return "orgform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("org") Organization org) {
        dao.save(org);
        return "redirect:/vieworg";
    }

    @RequestMapping("/vieworg")
    public String vieworg(Model m) {
        List<Organization> organizationList = dao.getOrganizations();
        m.addAttribute("list", organizationList);
        return "vieworg";
    }

    @RequestMapping(value = "/editorg/{id_org}")
    public String edit(@PathVariable int id_org, Model m) {
        Organization organization = dao.getOrganizationById(id_org);
        m.addAttribute("command", organization);
        return "editorgform";
    }

    @RequestMapping(value = "/editssave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("org") Organization org) {
        dao.update(org);
        return "redirect:/vieworg";
    }

    @RequestMapping(value = "/deleteorg/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id_org) {
        dao.delete(id_org);
        return "redirect:/vieworg";
    }
}
