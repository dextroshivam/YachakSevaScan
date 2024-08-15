//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Report;
//import com.yourname.yss.Repository.ReportRepository;
//import com.yourname.yss.Service.ReportService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class ReportServiceImpl implements ReportService {
//
//    private final ReportRepository reportRepository;
//
//    @Override
//    public Optional<Report> getReportById(Long reportId) {
//        return reportRepository.findById(reportId);
//    }
//
//    @Override
//    public Report createReport(Report report) {
//        return reportRepository.save(report);
//    }
//
//    @Override
//    public Report updateReport(Report report) {
//        return reportRepository.save(report);
//    }
//
//    @Override
//    public void deleteReport(Long reportId) {
//        reportRepository.deleteById(reportId);
//    }
//}
