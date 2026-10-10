package edu.wctc.wholesale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String showOrders(Model model) {
        model.addAttribute("orderList", orderService.getAllOrders());
        return "index";
    }
}