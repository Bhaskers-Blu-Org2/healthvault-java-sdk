/*
 *  Copyright (c) Microsoft Corporation
 *
 *	All rights reserved. 
 *
 *	MIT License
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the ""Software""), to deal in the Software without
 *  restriction, including without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom
 *  the Software is furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all copies or
 *  substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.hsg.android.healthvault.methods.searchvocabulary.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import com.microsoft.hsg.android.healthvault.methods.request.HVMethodRequest;
import com.microsoft.hsg.android.healthvault.methods.request.HVRequestInfo;
import com.microsoft.hsg.android.healthvault.vocabs.types.VocabIdentifier;

@Root(name = "info")
@HVMethodRequest(methodName="SearchVocabulary", methodVersion="1")
@Order(elements = {
    "vocabulary-key",
    "text-search-parameters"
})
public class SearchVocabularyRequest implements HVRequestInfo {

	@Element(name="vocabulary-key", required=false)
	protected VocabIdentifier vocabKey;
	
	@Element(name="text-search-parameters", required=true)
	protected VocabSearch vocabSearch;

	public VocabIdentifier getVocabKey() {
		return vocabKey;
	}

	public void setVocabKey(VocabIdentifier vocabKey) {
		this.vocabKey = vocabKey;
	}

	public VocabSearch getVocabSearch() {
		return vocabSearch;
	}

	public void setVocabSearch(VocabSearch vocabSearch) {
		this.vocabSearch = vocabSearch;
	}

	public SearchVocabularyRequest(VocabIdentifier vocabKey,
		VocabSearch vocabSearch) {
		this.vocabKey = vocabKey;
		this.vocabSearch = vocabSearch;
	}

	public SearchVocabularyRequest() {
	}
}