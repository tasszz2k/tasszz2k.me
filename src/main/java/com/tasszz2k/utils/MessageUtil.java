/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tasszz2k.utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author TASS
 */
public class MessageUtil {

    public static void showMessage(HttpServletRequest request) {
        if (request.getParameter("message") != null) {
            String message = request.getParameter("message");
            String messageResponse = "";
            String alert = "";

            if (message.equals("insert_success")) {
                messageResponse = "Insert success";
                alert = "success";
            } else if (message.equals("update_success")) {
                messageResponse = "Update success";
                alert = "success";

            } else if (message.equals("delete_success")) {
                messageResponse = "Delete success";
                alert = "success";
            } else if (message.equals("error_system")) {
                messageResponse = "Error System";
                alert = "danger";
            }
            request.setAttribute("message", messageResponse);
            request.setAttribute("alert", alert);
        }

    }
}
