Feature: blog

Scenario: Validate blog entering functionality
	Given user is in Blog page
	When user enter data in search field
	Then data should appear in search field