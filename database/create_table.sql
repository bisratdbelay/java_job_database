USE JobSearch;
CREATE TABLE Job (
JobID int AUTO_INCREMENT PRIMARY KEY,
JobURL varchar(255),
CompanyName varchar(255),
JobTitle varchar(50),
Location varchar(50),
DateStamp datetime DEFAULT CURRENT_TIMESTAMP,
Interview boolean,
Replied boolean,
JobReq varchar(255),
ApplicantID int,
CONSTRAINT FK_ApplicantID FOREIGN KEY (ApplicantID) REFERENCES Applicant(ApplicantID)
); 