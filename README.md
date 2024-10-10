# Week IV Task4

PERSISTENCE FRAMEWORKS (JPA/HIBERNATE)

# Git and GitHub Concepts

This README serves as a guide to essential Git and GitHub concepts, including commands and steps for effective version control and collaboration on software projects as stated and asked by Flexisaf internship instructors.

## 1. **Creating a Repository**

A repository (or repo) is where your project files live. You can create a repository locally on your machine or remotely on GitHub.

### **Creating a Repository on GitHub:**

1. **Log in to GitHub**: Navigate to [GitHub](https://github.com) and log in to your account.
  
2. **Create a New Repository**:
   - Click on the **+** icon in the top right corner and select **New repository**.
   - **Repository Name**: Choose a unique name for your repository. It should be descriptive of the project.
   - **Description** (optional): Provide a short description of what your repository will contain.
   - **Visibility**: Choose whether to make the repository **public** (visible to everyone) or **private** (only visible to you and those you share it with).
   - **Initialize Repository**: Optionally, you can check **Add a README file** to include a README.md file. This is a good practice for documentation.

3. **Create the Repository**: Click the **Create repository** button to finalize the setup.

### **Creating a Local Repository:**

To initialize a local Git repository in a project folder on your machine:

1. Open your terminal or command prompt.
2. Navigate to your project directory:
   ```bash
   cd path/to/your/project
   ```
3. Initialize the repository:
   ```bash
   git init
   ```
   This command creates a new `.git` subdirectory in your project folder, which contains all the metadata for the repository.

---

## 2. **Cloning a Repository**

Cloning allows you to create a local copy of a remote repository, enabling you to work on it offline or make changes that can be pushed back later.

### **Steps to Clone a Repository:**

1. **Access the Repository**: Go to the GitHub page of the repository you want to clone.
  
2. **Copy the Clone URL**:
   - Click the **Code** button on the repository page.
   - Copy the URL (choose HTTPS for simplicity).

3. **Use the Git Command**:
   Open your terminal and run:
   ```bash
   git clone https://github.com/username/repository.git
   ```
   Replace `username` and `repository` with the appropriate GitHub account and repository name. This command creates a new directory with the same name as the repository and pulls all the files and commit history.

---

## 3. **Creating Branches**

Branches allow you to work on different versions of a project simultaneously. The default branch in Git is usually named `main` or `master`.

### **Steps to Create a Branch:**

1. **Create a New Branch**:
   To create a new branch, use:
   ```bash
   git branch new-branch-name
   ```
   Replace `new-branch-name` with a descriptive name for your branch.

2. **Switch to the New Branch**:
   After creating the branch, you need to switch to it:
   ```bash
   git checkout new-branch-name
   ```

### **Combined Command:**
You can create and switch to a new branch in one command:
```bash
git checkout -b new-branch-name
```

Using branches helps keep your work organized and enables you to isolate features or fixes until they are ready to be merged into the main branch.

---

## 4. **Committing Changes**

Committing changes saves your changes to the local repository. Each commit should have a message that describes what changes were made.

### **Steps to Commit Changes:**

1. **Stage Your Changes**:
   Before committing, you need to stage the files you’ve modified or added:
   ```bash
   git add .
   ```
   This command stages all changes. To stage specific files, replace `.` with the filename.

2. **Commit Your Changes**:
   After staging, commit the changes:
   ```bash
   git commit -m "A brief message describing the changes"
   ```
   Use a clear and concise message to explain the purpose of the commit.

Committing frequently with descriptive messages helps track the history of changes and makes it easier to understand the evolution of the project.

---

## 5. **Reverting Commits**

Reverting a commit creates a new commit that undoes the changes made in a previous commit. This is useful if a bug was introduced in a specific commit.

### **Steps to Revert a Commit:**

1. **Identify the Commit Hash**:
   Use the following command to see the commit history and find the hash of the commit you want to revert:
   ```bash
   git log
   ```

2. **Revert the Commit**:
   Once you have the hash, run:
   ```bash
   git revert <commit-hash>
   ```
   Replace `<commit-hash>` with the actual hash. This will create a new commit that reverses the changes from the specified commit.

---

## 6. **Pulling and Pushing Changes (Downstream and Upstream)**

**Pulling** updates your local repository with changes from the remote repository, while **pushing** uploads your local commits to the remote repository.

### **Steps to Pull Changes**:
To update your local branch with the latest changes from the remote repository:
```bash
git pull origin main
```
Replace `main` with the name of your current branch if it differs.

### **Steps to Push Changes**:
After committing your changes locally, you can push them to the remote repository:
```bash
git push origin main
```
Again, replace `main` with your current branch name. This command uploads your commits to the corresponding branch on the remote repository.

---

## 7. **Fetching Changes**

Fetching updates your local copy of the remote repository without merging those changes into your local branch. It allows you to see what changes have been made before deciding to integrate them.

### **Steps to Fetch Changes**:
```bash
git fetch origin
```
This command retrieves the latest commits from the remote repository but doesn’t merge them into your current branch. You can review the changes and decide to merge them later.

---

## 8. **Merging Branches**

Merging allows you to integrate changes from one branch into another, typically from a feature branch into the main branch.

### **Steps to Merge a Branch**:

1. **Switch to the Target Branch**:
   First, switch to the branch you want to merge changes into (e.g., `main`):
   ```bash
   git checkout main
   ```

2. **Merge the Other Branch**:
   Now, merge the branch that contains the changes you want:
   ```bash
   git merge new-branch-name
   ```
   This command applies the changes from `new-branch-name` into `main`. If there are conflicts, Git will prompt you to resolve them.

---

## 9. **Renaming Branches**

If you need to change the name of a branch, you can do it easily with Git.

### **Steps to Rename a Branch**:

1. **Rename the Current Branch**:
   If you're currently on the branch you want to rename, use:
   ```bash
   git branch -m new-branch-name
   ```

2. **Push the Renamed Branch to Remote**:
   After renaming, you may want to update the remote repository:
   ```bash
   git push origin -u new-branch-name
   ```

   If the old branch name still exists on the remote, you might also want to delete it:
   ```bash
   git push origin --delete old-branch-name
   ```

---

## 10. **Creating Pull Requests**

A **Pull Request (PR)** is a request to merge your changes from one branch into another, typically used in collaborative environments to review and discuss changes before integration.

### **Steps to Create a Pull Request**:

1. **Push Your Branch to GitHub**: Ensure your feature branch is pushed to the remote repository.
   ```bash
   git push origin new-branch-name
   ```

2. **Go to Your Repository on GitHub**:
   Navigate to your repository in a web browser.

3. **Open the Pull Requests Tab**:
   Click on the **Pull requests** tab.

4. **Click on New Pull Request**:
   - Select the base branch (usually `main`) and the branch you want to merge (your feature branch).
   - Review the changes and description.

5. **Submit the Pull Request**: Click **Create pull request**. Optionally, add comments or details about the changes.

---

## 11. **Reviewing and Merging Pull Requests**

Once a pull request is created, it can be reviewed by collaborators before being merged into the main branch.

### **Steps to Review and Merge a Pull Request**:

1. **Access the Pull Request**: Go to the **Pull requests** tab in your repository.

2. **Review the Changes**:
   - Read the comments and check the changes made in the PR.
   - You can leave feedback, request changes, or approve the PR.

3. **Merge the Pull Request**:
   - Once approved, click the **Merge pull request** button.
   - Optionally, add a message for the merge commit.
   - Click **Confirm merge** to finalize the integration into the base branch.

---

## 12. **Reverting Pull Requests**

If a pull request has been merged but causes issues, you can revert it to undo its