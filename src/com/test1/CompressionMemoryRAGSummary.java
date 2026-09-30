package com.test1;

public class CompressionMemoryRAGSummary {
	private long memorySummaryId;
	private long memoryRagConfigurationId;
	private String sessionId;
	private String conversationStartTime;
	private String conversationEndTime;
	private long totalTurns;
	private long originalTokenCount;
	private long compressedTokenCount;
	private String compressionRatio;
	private String conversationSummary;
	private String keyTopics;
	private String importantEntities;
	private String userIntent;
	private String decisionsCaptured;
	private String actionItems;
	private String factsRetained;
	private String compressionModel;
	private long summaryVersion;

	public CompressionMemoryRAGSummary() {

	}

	public CompressionMemoryRAGSummary(long memorySummaryId, long memoryRagConfigurationId, String sessionId,
			String conversationStartTime, String conversationEndTime, long totalTurns, long originalTokenCount,
			long compressedTokenCount, String compressionRatio, String conversationSummary, String keyTopics,
			String importantEntities, String userIntent, String decisionsCaptured, String actionItems,
			String factsRetained, String compressionModel, long summaryVersion) {
		super();
		this.memorySummaryId = memorySummaryId;
		this.memoryRagConfigurationId = memoryRagConfigurationId;
		this.sessionId = sessionId;
		this.conversationStartTime = conversationStartTime;
		this.conversationEndTime = conversationEndTime;
		this.totalTurns = totalTurns;
		this.originalTokenCount = originalTokenCount;
		this.compressedTokenCount = compressedTokenCount;
		this.compressionRatio = compressionRatio;
		this.conversationSummary = conversationSummary;
		this.keyTopics = keyTopics;
		this.importantEntities = importantEntities;
		this.userIntent = userIntent;
		this.decisionsCaptured = decisionsCaptured;
		this.actionItems = actionItems;
		this.factsRetained = factsRetained;
		this.compressionModel = compressionModel;
		this.summaryVersion = summaryVersion;
	}

	public long getMemorySummaryId() {
		return memorySummaryId;
	}

	public void setMemorySummaryId(long memorySummaryId) {
		this.memorySummaryId = memorySummaryId;
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

	public String getConversationStartTime() {
		return conversationStartTime;
	}

	public void setConversationStartTime(String conversationStartTime) {
		this.conversationStartTime = conversationStartTime;
	}

	public String getConversationEndTime() {
		return conversationEndTime;
	}

	public void setConversationEndTime(String conversationEndTime) {
		this.conversationEndTime = conversationEndTime;
	}

	public long getTotalTurns() {
		return totalTurns;
	}

	public void setTotalTurns(long totalTurns) {
		this.totalTurns = totalTurns;
	}

	public long getOriginalTokenCount() {
		return originalTokenCount;
	}

	public void setOriginalTokenCount(long originalTokenCount) {
		this.originalTokenCount = originalTokenCount;
	}

	public long getCompressedTokenCount() {
		return compressedTokenCount;
	}

	public void setCompressedTokenCount(long compressedTokenCount) {
		this.compressedTokenCount = compressedTokenCount;
	}

	public String getCompressionRatio() {
		return compressionRatio;
	}

	public void setCompressionRatio(String compressionRatio) {
		this.compressionRatio = compressionRatio;
	}

	public String getConversationSummary() {
		return conversationSummary;
	}

	public void setConversationSummary(String conversationSummary) {
		this.conversationSummary = conversationSummary;
	}

	public String getKeyTopics() {
		return keyTopics;
	}

	public void setKeyTopics(String keyTopics) {
		this.keyTopics = keyTopics;
	}

	public String getImportantEntities() {
		return importantEntities;
	}

	public void setImportantEntities(String importantEntities) {
		this.importantEntities = importantEntities;
	}

	public String getUserIntent() {
		return userIntent;
	}

	public void setUserIntent(String userIntent) {
		this.userIntent = userIntent;
	}

	public String getDecisionsCaptured() {
		return decisionsCaptured;
	}

	public void setDecisionsCaptured(String decisionsCaptured) {
		this.decisionsCaptured = decisionsCaptured;
	}

	public String getActionItems() {
		return actionItems;
	}

	public void setActionItems(String actionItems) {
		this.actionItems = actionItems;
	}

	public String getFactsRetained() {
		return factsRetained;
	}

	public void setFactsRetained(String factsRetained) {
		this.factsRetained = factsRetained;
	}

	public String getCompressionModel() {
		return compressionModel;
	}

	public void setCompressionModel(String compressionModel) {
		this.compressionModel = compressionModel;
	}

	public long getSummaryVersion() {
		return summaryVersion;
	}

	public void setSummaryVersion(long summaryVersion) {
		this.summaryVersion = summaryVersion;
	}

}
