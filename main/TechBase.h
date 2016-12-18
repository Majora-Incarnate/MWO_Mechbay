#ifndef TECHBASE_H
#define TECHBASE_H

#include <string>

class TechBase {
public:
    static const TechBase UNIVERSAL;
    static const TechBase INNER_SPHERE;
    static const TechBase CLAN;

private:
    enum class TechEnum;

    const TechEnum enumId;
    const std::string longName;
    const std::string shortName;

    TechBase(const TechEnum & techBase, const std::string & fullName, const std::string & abbreviation);
};

#endif // TECHBASE_H
