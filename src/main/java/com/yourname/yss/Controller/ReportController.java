//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.Report;
//import com.yourname.yss.Service.ReportService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/reports")
//@RequiredArgsConstructor
//public class ReportController {
//
//    private final ReportService reportService;
//
//    @PostMapping("/generate")
//    public Report generateReport(@RequestBody ReportRequest request) {
//        return reportService.generateReport(request);
//    }
//
//    @GetMapping("/{reportId}")
//    public Report getReport(@PathVariable Long reportId) {
//        return reportService.getReportById(reportId);
//    }
//}
