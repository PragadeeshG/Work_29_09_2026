package com.test1;

public class CompressionMemoryRAGRetrieval {
	private long memoryRetrievalId;
	private long memoryRagConfigurationId;
	private String sessionId;
	private String userQuery;
	private String queryEmbedddingReference;
	private String retrievalStrategy;
	private String shortTermMemoryRetrieved;
	private String compressedMemoryRetrieved;
	private long retrievedMemoryCount;
	private String similarityThreshold;
	private long topMemories;
	private String memoryRelevanceScore;
	private String memoryRankingStrategy;
	private long duplicateMemoryRemoved;
	private long selectedMemoryCount;
	private long retrievedTokenCount;
	private long retrievalLatency;

	public CompressionMemoryRAGRetrieval() {

	}

	public CompressionMemoryRAGRetrieval(long memoryRetrievalId, long memoryRagConfigurationId, String sessionId,
			String userQuery, String queryEmbedddingReference, String retrievalStrategy,
			String shortTermMemoryRetrieved, String compressedMemoryRetrieved, long retrievedMemoryCount,
			String similarityThreshold, long topMemories, String memoryRelevanceScore, String memoryRankingStrategy,
			long duplicateMemoryRemoved, long selectedMemoryCount, long retrievedTokenCount, long retrievalLatency) {
		super();
		this.memoryRetrievalId = memoryRetrievalId;
		this.memoryRagConfigurationId = memoryRagConfigurationId;
		this.sessionId = sessionId;
		this.userQuery = userQuery;
		this.queryEmbedddingReference = queryEmbedddingReference;
		this.retrievalStrategy = retrievalStrategy;
		this.shortTermMemoryRetrieved = shortTermMemoryRetrieved;
		this.compressedMemoryRetrieved = compressedMemoryRetrieved;
		this.retrievedMemoryCount = retrievedMemoryCount;
		this.similarityThreshold = similarityThreshold;
		this.topMemories = topMemories;
		this.memoryRelevanceScore = memoryRelevanceScore;
		this.memoryRankingStrategy = memoryRankingStrategy;
		this.duplicateMemoryRemoved = duplicateMemoryRemoved;
		this.selectedMemoryCount = selectedMemoryCount;
		this.retrievedTokenCount = retrievedTokenCount;
		this.retrievalLatency = retrievalLatency;
	}

	public long getMemoryRetrievalId() {
		return memoryRetrievalId;
	}

	public void setMemoryRetrievalId(long memoryRetrievalId) {
		this.memoryRetrievalId = memoryRetrievalId;
	}

	public long getMemoryRagConfigurationId() {
		return memoryRagConfigurationId;
	}

	public void setMemoryRagConfigurationId(long memoryRagConfigurationId) {
		this.memoryRagConfigurationId = memoryRagConfigurationId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getQueryEmbedddingReference() {
		return queryEmbedddingReference;
	}

	public void setQueryEmbedddingReference(String queryEmbedddingReference) {
		this.queryEmbedddingReference = queryEmbedddingReference;
	}

	public String getRetrievalStrategy() {
		return retrievalStrategy;
	}

	public void setRetrievalStrategy(String retrievalStrategy) {
		this.retrievalStrategy = retrievalStrategy;
	}

	public String getShortTermMemoryRetrieved() {
		return shortTermMemoryRetrieved;
	}

	public void setShortTermMemoryRetrieved(String shortTermMemoryRetrieved) {
		this.shortTermMemoryRetrieved = shortTermMemoryRetrieved;
	}

	public String getCompressedMemoryRetrieved() {
		return compressedMemoryRetrieved;
	}

	public void setCompressedMemoryRetrieved(String compressedMemoryRetrieved) {
		this.compressedMemoryRetrieved = compressedMemoryRetrieved;
	}

	public long getRetrievedMemoryCount() {
		return retrievedMemoryCount;
	}

	public void setRetrievedMemoryCount(long retrievedMemoryCount) {
		this.retrievedMemoryCount = retrievedMemoryCount;
	}

	public String getSimilarityThreshold() {
		return similarityThreshold;
	}

	public void setSimilarityThreshold(String similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
	}

	public long getTopMemories() {
		return topMemories;
	}

	public void setTopMemories(long topMemories) {
		this.topMemories = topMemories;
	}

	public String getMemoryRelevanceScore() {
		return memoryRelevanceScore;
	}

	public void setMemoryRelevanceScore(String memoryRelevanceScore) {
		this.memoryRelevanceScore = memoryRelevanceScore;
	}

	public String getMemoryRankingStrategy() {
		return memoryRankingStrategy;
	}

	public void setMemoryRankingStrategy(String memoryRankingStrategy) {
		this.memoryRankingStrategy = memoryRankingStrategy;
	}

	public long getDuplicateMemoryRemoved() {
		return duplicateMemoryRemoved;
	}

	public void setDuplicateMemoryRemoved(long duplicateMemoryRemoved) {
		this.duplicateMemoryRemoved = duplicateMemoryRemoved;
	}

	public long getSelectedMemoryCount() {
		return selectedMemoryCount;
	}

	public void setSelectedMemoryCount(long selectedMemoryCount) {
		this.selectedMemoryCount = selectedMemoryCount;
	}

	public long getRetrievedTokenCount() {
		return retrievedTokenCount;
	}

	public void setRetrievedTokenCount(long retrievedTokenCount) {
		this.retrievedTokenCount = retrievedTokenCount;
	}

	public long getRetrievalLatency() {
		return retrievalLatency;
	}

	public void setRetrievalLatency(long retrievalLatency) {
		this.retrievalLatency = retrievalLatency;
	}

}
