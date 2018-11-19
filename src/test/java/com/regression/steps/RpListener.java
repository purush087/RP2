package com.regression.steps;

import com.epam.reportportal.cucumber.StepReporter;
import com.epam.reportportal.service.ReportPortal;
import rp.org.apache.http.conn.ssl.NoopHostnameVerifier;
import rp.org.apache.http.impl.client.HttpClients;

public class RpListener extends StepReporter {
	protected ReportPortal buildReportPortal() {
		return ReportPortal.builder()
				.withHttpClient(HttpClients.custom().
						setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)).build();
	}
}
