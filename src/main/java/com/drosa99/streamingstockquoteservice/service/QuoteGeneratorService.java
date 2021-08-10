package com.drosa99.streamingstockquoteservice.service;

import com.drosa99.streamingstockquoteservice.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {

		Flux<Quote> fetchQuoteStream(Duration period);
}
